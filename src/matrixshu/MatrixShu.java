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
 * 
 * Voorzie twee versies van de immutable versie: één waarbij de elementen intern opgeslagen worden in een
 * array in row major order, en één waarbij de elementen intern opgeslagen worden in een array in column 
 * major order. De API van beide versies moet identiek zijn (zowel qua syntax als qua semantiek 
 * (= observeerbaar gedrag)), en ze moeten precies dezelfde testsuite doen slagen. Voorzie een testsuite 
 * die alle code van beide versies covert (behalve code die enkel uitgevoerd wordt in geval van een fout).
 *  
 * Voorzie ook twee versies van de mutable versie: één waarbij de elementen intern opgeslagen worden in 
 * een array in row major order, en één waarbij de elementen intern opgeslagen worden in een array van 
 * arrays. De API van beide versies moet identiek zijn (zowel qua syntax als qua semantiek (= observeerbaar
 * gedrag)), en ze moeten precies dezelfde testsuite doen slagen. Voorzie een testsuite die alle code van 
 * beide versies covert (behalve code die enkel uitgevoerd wordt in geval van een fout).
 * 
 * Voorzie telkens volledige publieke en interne formele documentatie. (Dat houdt ook in dat je voor elke 
 * constructor en elke methode met behulp van @inspects- en @mutates-clausules specificeert welke 
 * klant-zichtbare objecten door die constructor or methode geïnspecteerd of gewijzigd worden, tenzij 
 * de methodenaam begint met get gevolgd door een hoofdletter en de methode this inspecteert en geen 
 * objecten wijzigt.)
 * Handel ongeldige argumenten voor de constructoren defensief af, en ongeldige argumenten voor 
 * de methodes contractueel.
 */

/**
 * @immutable
 */
public class MatrixShu {
	
	/**
	 * @representationObjects
	 */
	private double[][] matrix;
	
	public int getAmountOfRows() {
		int aantalRijen = 0;
		for (int i = 0; i < getMatrix().length; i++) {
			aantalRijen +=1;
		}
		return aantalRijen;
	}
	
	public int getAmountOfColumns() {
		int aantalKolommen = 0;
		for(int i = 0; i < matrix[0].length; i++) {
			aantalKolommen +=1;
		}
		return aantalKolommen;
	}
	
	public double getElement(int row, int column) {
		double getal = matrix[row][column];
		return getal;
	}
	
	public double[] getElementsRowMajor() {
		double[] array = new double[getAmountOfColumns()*getAmountOfRows()];
		for (int i = 0; i <array.length; i++) {
			for (int j = 0; j < getAmountOfRows(); j++) {
				for(int k = 0; k <getAmountOfColumns(); k++) {
					array[i] = matrix[j][k];
				}
			}
		}
		return array;
	}
	
	/**
	 * @creates | result
	 */
	public double[] getElementsColumnMajor() {
		double[] array = new double[getAmountOfColumns()*getAmountOfRows()];
		for (int i = 0; i <array.length; i++) {
			for (int j = 0; j < getAmountOfColumns(); j++) {
				for(int k = 0; k <getAmountOfRows(); k++) {
					array[i] = matrix[k][j];
				}
			}
		}
		return array;
	}

	/**
	 * @creates | this
	 */
	public double[][] getMatrix() {
		return matrix.clone();
	}
	
	/**
	 * @pre | rows >= 0
	 * @pre | columns >= 0
	 * @post | getMatrix().length == columns
	 */
	public MatrixShu(int rows, int columns) {
		if (rows == 0 && columns > 0) {
			throw new IllegalArgumentException("Deze matrix bestaat niet. Er zijn geen rijen.");
		}
		if (columns == 0 && rows > 0) {
			throw new IllegalArgumentException("Deze matrix bestaat niet. Er zijn geen kolommen");
		}
		matrix = new double[rows][columns];
		
	}
	
	// scaled en plus zijn geen mutatoren, maar ook afgeleide getters!
	/**
	 * @creates | result
	 */
	public double[][] scaled(int number){
		double[][] A = new double[getAmountOfRows()][getAmountOfColumns()];
		for (int rij = 0; rij < getAmountOfRows(); rij++) {
			for (int kolom = 0; kolom < getAmountOfColumns(); kolom++) {
				A[rij][kolom] = getMatrix()[rij][kolom]*number;
			}
		}
		return A;
	}
	
	/**
	 * @creates | result
	 */
	public double[][] plus(double[][] A){
		double[][] B = new double[getAmountOfRows()][getAmountOfColumns()];
		for (int rij = 0; rij < getAmountOfRows(); rij++) {
			for (int kolom = 0; kolom < getAmountOfColumns(); kolom++) {
				B[rij][kolom] = A[rij][kolom] + getMatrix()[rij][kolom];
			}
		}
		return B;
	}

}
