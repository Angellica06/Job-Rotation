package questao4;

public class Faturamento {
   double fatSp;
   double fatRj;
   double fatMg;
   double fatEs;
   double fatOut;
   double total;
   
   public Faturamento() {
	   
   }
   public double getFatSp() {
	return fatSp;
   }
   public void setFatSp(double fatSp) {
	this.fatSp = fatSp;
   }
   public double getFatRj() {
	return fatRj;
   }
   public void setFatRj(double fatRj) {
	this.fatRj = fatRj;
   }
   public double getFatMg() {
	return fatMg;
   }
   public void setFatMg(double fatMg) {
	this.fatMg = fatMg;
   }
   public double getTotal() {
	return total;
   }
   public void setTotal(double total) {
	this.total = total;
   }  
   public double getFatEs() {
	return fatEs;
   }
   public void setFatEs(double fatEs) {
	this.fatEs = fatEs;
   }
   public double getFatOut() {
	return fatOut;
   }
   public void setFatOut(double fatOut) {
	this.fatOut = fatOut;
   }
   
   
   public double valorTotal() {
       return (this.getFatSp() ) + (this.getFatRj() ) + (this.getFatMg() + (this.getFatEs()) + (this.getFatOut())); 
   }
   
   public double percentual() {
	 return ((this.getFatSp() / valorTotal()) * 100); 
   }
   
}
