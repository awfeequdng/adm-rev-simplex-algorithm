package Datenstrukturen;

import java.util.ArrayList;

public class Vector {

	private double[] vec;
	
	private int size;
	
	public Vector(int size){
		vec = new double[size];
	}
	
	public Vector(double[] d){
		vec = d;
	}
	
	public void negateBi(int i){
		vec[i] = -vec[i];
	}
	
//	public void addEntry(int isBasis,int index, double value) throws IllegalArgumentException{
//		
//		if(vec.isEmpty()){
//			vec.add(new Triple(isBasis,index, value));
//		}
//		else if(vec.get(vec.size()-1).getColumn() < index){
//			vec.add(new Triple(isBasis, index, value));
//		}
//		else{
//			int i;
//			for( i=0 ; i< vec.size() ; i++){
//				if( vec.get(i).getColumn() == index)
//					throw new IllegalArgumentException("Element existiert bereits!!!");
//				if( vec.get(i).getColumn()> index)
//					vec.add(index, new Triple(isBasis,index, value));
//			}
//		}
//	}
	
	/**
	 * Laenge der ArrayList
	 * @return
	 */
	public int getLength(){
		return vec.length;
	}
	
	public double get(int index){
		return vec[index];
	}

	@Override
	public String toString() {
		String out = "";
		for( Double t : vec){
			out += ""+t+ " ; ";
		}
		return "Vector: \n"+out;
	}

	/**
	 * Tatsaechliche L�nge des Vektors, d.h. die 0-Eintraege mitgezaehlt
	 * @return
	 */
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public double[] getVec() {
		return vec;
	}
	
	

	public void setVec(double[] vec) {
		this.vec = vec;
	}

}
