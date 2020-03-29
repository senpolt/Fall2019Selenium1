package com.automation.tests.day12;

public class N_O_T_E_TableAndCompareTo {
    /**
     * Warm-up task for 15 minutes:
     * Go to http://practice.cybertekschool.com/tables
     * Click on "Last name" column name
     * Verify that table is sorted by last name in alphabetic order.
     * until 11:19
     * "a".compareTo("b") = -1
     * 61 - 62 = -1
     * a is before b
     * "a".compareTo("a")
     * 61 - 61 = 0
     * 0 means 2 strings are equals
     * table - tag that is used to create a web table in HTML
     * <table>
     *     <thead>
     *         <tr>
     *             <th>First Name</th>
     *             <th>Last Name</th>
     *             <th>Address</th>
     *         </tr>
     *     </thead>
     *     <tbody>
     *         <tr>
     *             <td>James</td>
     *             <td>May</td>
     *             <td>101 Groove St.</td>
     *         </tr>
     *         <tr>
     *             <td>Mark</td>
     *             <td>Portman</td>
     *             <td>974 Green Ave</td>
     *         </tr>
     *     </tbody>
     * </table>
     * //table[1] - get the first table on the page
     * //table[1]//tr - get all rows from first table
     * //table[1]//tbody//tr - get all rows from the first table, excluding table header
     * //table//tbody//td[1] - get first column
     * //table//tbody//tr[1] - get first row
     * //table//tbody//tr[2]//td[1] - get data from second row, first column
     * //table//th - get all column names
     * //table//tbody//td[last()] - get last column
     * //table//tbody//tr[last()] - get last row
     */
}
