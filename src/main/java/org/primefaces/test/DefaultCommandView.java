package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.faces.annotation.FacesConfig;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@FacesConfig
@ViewScoped
@Named (value = "defaultCommandView")
public class DefaultCommandView implements Serializable
{

    private static final long serialVersionUID = 2206613591644702354L;

    private String text;

    private String text2;

    private String btn;

    private List < String > buttons;

    @PostConstruct
    public void init ( )
    {
        buttons = new ArrayList <> ( );
        buttons.add ( "btn1" );
        buttons.add ( "btn2" );
        buttons.add ( "btn3" );
    }

    public String getBtn ( )
    {
        return btn;
    }

    public void setBtn ( String btn )
    {
        this.btn = btn;
    }

    public List < String > getButtons ( )
    {
        return buttons;
    }

    public void setButtons ( List < String > buttons )
    {
        this.buttons = buttons;
    }

    public String getText ( )
    {
        return text;
    }

    public void setText ( String text )
    {
        this.text = text;
    }

    public String getText2 ( )
    {
        return text2;
    }

    public void setText2 ( String text2 )
    {
        this.text2 = text2;
    }

    public void addMessage ( String btn )
    {
        FacesContext.getCurrentInstance ( ).addMessage ( null, new FacesMessage ( "Submitted with " + btn ) );
    }

    public void btn1Submit ( )
    {
        addMessage ( "btn1" );
    }

    public void btn2Submit ( )
    {
        addMessage ( "btn2" );
    }

    public void btn3Submit ( )
    {
        addMessage ( "btn3" );
    }
    
}