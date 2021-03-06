package com.Dismas.GovnoSoft.Dao;

import com.Dismas.GovnoSoft.Bean.Program;
import com.Dismas.GovnoSoft.HashGen.UUIDGen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dmitry on 11.06.2018.
 */
@Repository
public class ProgramDao {

    @Autowired
    JdbcTemplate template;

   UUIDGen ug = new UUIDGen();
    /*public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }*/

    public int save(Program p){
     String sql="insert into program values ('"+p.getId()+"','"+p.getName()+"','"+p.getUrl()+"','"+ug.idOne+"');";
     return template.update(sql);
    }

    public List<Program> getPrograms(){
        System.out.println("Reading from Programs table");
        return template.query("Select * from program", (rs, row) -> {
            Program p = new Program();
            p.setId(rs.getInt(1));
            p.setName(rs.getString(2));
            p.setUrl(rs.getString(3));
            p.setHash(rs.getString(4));
            return p;
        });
    }

}
