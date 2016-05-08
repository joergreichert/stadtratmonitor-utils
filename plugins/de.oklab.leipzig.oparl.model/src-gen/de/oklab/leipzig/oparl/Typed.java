/**
 */
package de.oklab.leipzig.oparl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getTyped()
 * @model abstract="true"
 * @generated
 */
public interface Typed extends Identifiable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Objekttypenangabe des Objekts, zwingend für jedes Objekt.
     * Der Wert ist eine Namespace-URL. Für die OParl-Objekttypen sind die
     * folgenden URLs definiert:
     * </p>
     * <p>
     * <table border="1">
     *   <tr>
     *     <th>Typ (kurz)</th><th>Namespace-URL</th>
     *   </tr>
     *   <tr><td>oparl:AgendaItem</td><td>https://oparl.org/schema/1.0/AgendaItem</td></tr>
     *   <tr><td>oparl:Body</td><td>https://oparl.org/schema/1.0/Body</td></tr>
     *   <tr><td>oparl:Consultation</td><td>https://oparl.org/schema/1.0/Consultation</td></tr>
     *   <tr><td>oparl:File</td><td>https://oparl.org/schema/1.0/File</td></tr>
     *   <tr><td>oparl:LegislativeTerm</td><td>https://oparl.org/schema/1.0/LegislativeTerm</td></tr>
     *   <tr><td>oparl:Location</td><td>https://oparl.org/schema/1.0/Location</td></tr>
     *   <tr><td>oparl:Meeting</td><td>https://oparl.org/schema/1.0/Meeting</td></tr>
     *   <tr><td>oparl:Membership</td><td>https://oparl.org/schema/1.0/Membership</td></tr>
     *   <tr><td>oparl:Organization</td><td>https://oparl.org/schema/1.0/Organization</td></tr>
     *   <tr><td>oparl:Paper</td><td>https://oparl.org/schema/1.0/Paper</td></tr>
     *   <tr><td>oparl:Person</td><td>https://oparl.org/schema/1.0/Person</td></tr>
     *   <tr><td>oparl:System</td><td>https://oparl.org/schema/1.0/System</td></tr>
     * </table>
     * </p>
     * <!-- end-model-doc -->
     * @model kind="operation" dataType="de.oklab.leipzig.oparl.OParlType" unique="false"
     * @generated
     */
    String getType();

} // Typed
