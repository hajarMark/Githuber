package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/githubers")
public class GithubersServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException{
        ArrayList<Githuber> listGithubers = new ArrayList<>();

        Githuber git1=new Githuber("Gituber1","Gituber1@gmail.com","Git1",1,"http://www.adresse1.com");
        Githuber git2=new Githuber("Gituber2","Gituber2@gmail.com","Git2",1,"http://www.adresse2.com");
        Githuber git3=new Githuber("Gituber3","Gituber3@gmail.com","Git3",1,"http://www.adresse3.com");
        Githuber git4=new Githuber("Gituber4","Gituber4@gmail.com","Git4",1,"http://www.adresse4.com");
        Githuber git5=new Githuber("Gituber5","Gituber4@gmail.com","Git5",1,"http://www.adresse5.com");

    listGithubers.add(git1);
    listGithubers.add(git2);
    listGithubers.add(git3);
    listGithubers.add(git4);
    listGithubers.add(git5);
    req.setAttribute("listGithubers", listGithubers);
    this.getServletContext()
				.getRequestDispatcher("/githubers.jsp")
				.forward(req, resp);
    }

}
