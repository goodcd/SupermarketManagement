package com.cs.means;


import java.sql.*;

import com.cs.base.Business;


public class Del_Data {
    public Del_Data() {
    }

    private static final String delData1 =
            "delete from User where cardId=?";
    public static int delCard(String cardId) {
        int i = 0;
        Connection conn = null;
        PreparedStatement pmst = null;
        ResultSet rs = null;
        conn = Business.getConnection();

        try {
            pmst = conn.prepareStatement(delData1);
            pmst.setString(1, cardId);
            i = pmst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (pmst != null) {
                    pmst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }
        }

        return i;
    }
}
