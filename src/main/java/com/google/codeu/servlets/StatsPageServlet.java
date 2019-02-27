package com.google.codeu.servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Responds with a hard-coded message for testing purposes.
 */
@WebServlet("/stats")
public class StatsPageServlet extends HttpServlet{
  
 @Override
 public void doGet(HttpServletRequest request, HttpServletResponse response)
   throws IOException {
  
  response.getOutputStream().println("hello world");
 }

// /** Returns the total number of messages for all users. */
// public int getTotalMessageCount(){
//  Query query = new Query("Message");
//  PreparedQuery results = datastore.prepare(query);
//  return results.countEntities(FetchOptions.Builder.withLimit(1000));
// }
}
