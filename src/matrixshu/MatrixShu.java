package matrixshu;
/**
 * Definieer en implementeer een Matrix-abstractie. 
 * Een instantie van de abstractie stelt een matrix van kommagetallen (Java-type double) voor. 
 * Laat de klant toe een Matrix-object aan te maken met een gegeven aantal rijen en kolommen en gegeven 
 * elementen, waarbij de elementen gegeven worden in een array in row major order (dus eerst de elementen 
 * voor de eerste rij, dan de elementen voor de tweede rij, enz.). Laat de klant toe het aantal rijen, 
 * het aantal kolommen, en het element op een gegeven rij en kolom op te vragen. Laat de klant ook toe de 
 * elementen op te vragen als een array in row major order, als een array in column major order, en als een 
 * array van rijen (waarbij elke rij een array is).
 * 
 * Voorzie een immutable versie, met een methode scaled die een nieuwe matrix teruggeeft waarvan elk element
 * een gescaleerde (dus met een gegeven getal vermenigvuldigde) versie is van het overeekomstige element 
 * van de gegeven matrix, en een methode plus die een nieuwe matrix teruggeeft waarvan elk element de som 
 * is van de overeenkomstige elementen van de twee gegeven matrices.
 * 
 * Voorzie ook een mutable versie, waarbij de methodes scale (tegenhanger van scaled) en add 
 * (tegenhanger van plus) de matrix aanpassen waarop de methode opgeroepen wordt.
 * Voorzie twee versies van de immutable versie: één waarbij de elementen intern opgeslagen worden in een
 * array in row major order, en één waarbij de elementen intern opgeslagen worden in een array in column 
 * major order. De API van beide versies moet identiek zijn (zowel qua syntax als qua semantiek 
 * (= observeerbaar gedrag)), en ze moeten precies dezelfde testsuite doen slagen. Voorzie een testsuite 
 * die alle code van beide versies covert (behalve code die enkel uitgevoerd wordt in geval van een fout). 
 * Voorzie ook twee versies van de mutable versie: één waarbij de elementen intern opgeslagen worden in 
 * een array in row major order, en één waarbij de elementen intern opgeslagen worden in een array van 
 * arrays. De API van beide versies moet identiek zijn (zowel qua syntax als qua semantiek (= observeerbaar
 * gedrag)), en ze moeten precies dezelfde testsuite doen slagen. Voorzie een testsuite die alle code van 
 * beide versies covert (behalve code die enkel uitgevoerd wordt in geval van een fout).
 * Voorzie telkens volledige publieke en interne formele documentatie. (Dat houdt ook in dat je voor elke 
 * constructor en elke methode met behulp van @inspects- en @mutates-clausules specificeert welke 
 * klant-zichtbare objecten door die constructor or methode geïnspecteerd of gewijzigd worden, tenzij 
 * de methodenaam begint met get gevolgd door een hoofdletter en de methode this inspecteert en geen 
 * objecten wijzigt.)
 * Handel ongeldige argumenten voor de constructoren defensief af, en ongeldige argumenten voor 
 * de methodes contractueel.
 */

/**
 * 
 * @immutable
 *
 */
public class MatrixShu {
	
	/**
	 * @representationObjects
	 */
	private double[] rij;
	private double[][] matrix;
	
	public int getAmountOfRows() {throw new RuntimeException("not yet implemented");}
	
	public int getAmountOfColumns() {throw new RuntimeException("not yet implemented");}
	
	public int getElement(int row, int column) {throw new RuntimeException("not yet implemented");}
	
	public int getElementsRowMajor() {throw new RuntimeException("not yet implemented");}
	
	public int getElementsColumnMajor() {throw new RuntimeException("not yet implemented");}
	
	public int getElementsAsArrayOfRows() {throw new RuntimeException("not yet implemented");}
	
	
	public MatrixShu(int rows, int columns) {throw new RuntimeException("not yet implemented");}
	
	//mutatoren
	public double[][] scaled(int number){throw new RuntimeException("not yet implemented");}
	
	public double[][] plus(double[][] A){throw new RuntimeException("not yet implemented");}
	
		

}
