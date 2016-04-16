
package Functions;
/**
 *
 * @author Admin
 */
public class space
{
    /**
     *
     * @param spc
     * @return
     */
    public String space(String spc)
{
    int i=spc.length();
    for(int j=0;j<20-i;j++)
    {
        spc += " ";
    }
    return spc;
}
}
