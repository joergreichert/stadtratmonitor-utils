/**
 */
package de.oklab.leipzig.oparl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getNamed()
 * @model abstract="true"
 *        features="_name" 
 *        _nameUnique="false" _nameDataType="org.eclipse.emf.ecore.EString" _nameSuppressedGetVisibility="true" _nameSuppressedSetVisibility="true"
 * @generated
 */
public interface Named extends Tagged {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>
     * Beide Eigenschaften können bei vielen Objekttypen genutzt werden,
     * um den Namen des Objekts anzugeben. Üblicherweise ist name eine
     * Pflichteigenschaft für den ausgeschriebenen offiziellen Namen,
     * während shortName optional angegeben werden kann. Dies ist
     * dann zu empfehlen, wenn zu einem Namen eine kurze bzw. kompakte
     * und eine längere, aber weniger nutzerfreundliche Variante existieren.
     * Ein Beispiel wäre die Kurzform "CDU" für den offiziellen Parteinamen
     * "Christlich Demokratische Union Deutschlands".
     * </p>
     * <!-- end-model-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((<%de.oklab.leipzig.oparl.impl.NamedImpl%>) this)._name;'"
     * @generated
     */
    String getName();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model nameUnique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _equals = <%com.google.common.base.Objects%>.equal(name, null);\nif (_equals)\n{\n\tthrow new <%java.lang.IllegalArgumentException%>(\"Name isn\\\'t allowed to be null\");\n}\n((<%de.oklab.leipzig.oparl.impl.NamedImpl%>) this)._name = name;'"
     * @generated
     */
    void setName(String name);

} // Named
