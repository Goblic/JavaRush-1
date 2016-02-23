package com.javarush.test.level28.lesson15.big01.view;

import com.javarush.test.level28.lesson15.big01.Controller;
import com.javarush.test.level28.lesson15.big01.vo.Vacancy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Dmitry on 20.02.2016.
 */
public class HtmlView implements View
{
    Controller controller;
    private final String filePath = "./src/"+this.getClass().getPackage().toString().replace(".","/").substring(8,this.getClass().getPackage().toString().length()) + "/vacancies.html";
    @Override
    public void update(List<Vacancy> vacancies)
    {

    }

    @Override
    public void setController(Controller controller)
    {
        this.controller = controller;
    }
    public void userCitySelectEmulationMethod()
    {
        controller.onCitySelect("Odessa");
    }
    private String getUpdatedFileContent(List<Vacancy> list){
        return "";
    }
    private void updateFile(String s) throws IOException
    {
        BufferedWriter fWriter = new BufferedWriter(new FileWriter(filePath));
        fWriter.write(s);
        fWriter.close();

    }

}
