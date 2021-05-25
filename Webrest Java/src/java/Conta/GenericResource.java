/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conta;

import DAO.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author mikae
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of Conta.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
    
    /**
     *
     * @param num
     * @param id
     * @return
     */
    @GET
 @Produces(MediaType.APPLICATION_JSON)
 @Path("/{contaNum}")
 public Conta getConta(@PathParam("contaNum") long num) {

  Conta result = null;

  for (Conta conta : conta) {
   if (conta.getNum() == num) {
    result = conta;
    break;
   }
  }
}
 @DELETE
 @Path("/{num}")
 public void delete(@PathParam("num") long num) {
  Conta conta = conta.get(id - 1);
  conta.remove(conta);
 }
