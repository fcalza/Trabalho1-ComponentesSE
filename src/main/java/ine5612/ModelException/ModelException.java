/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.ModelException;

/**
 *
 * @author Calza
 */
public class ModelException extends Exception{

	private static final long serialVersionUID = 1L;

	public ModelException(){
		super("Este usuário não existe!");
	}
}
