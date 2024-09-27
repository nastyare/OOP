package org.example;

public class Table {
    private int rowCount;
    private int columnCount;
    private int[][] tableNumbers;

    Table(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;

        tableNumbers = new int[rowCount][columnCount];
    }

    public int getValue(int row, int column) {
        return tableNumbers[row][column];
    }

    public boolean setValue(int row, int column, int value) {
        tableNumbers[row][column] = value;
        return true;
    }

    public int rows() {
        return rowCount;
    }

    public int cols() {
        return columnCount;
    }

    public String toString() {
        String tableString = "";

        for (int indexRow = 0; indexRow < rowCount; ++indexRow) {
            for (int indexColumn = 0; indexColumn < columnCount; ++indexColumn) {
                tableString += tableNumbers[indexRow][indexColumn] + "\t";
            }

            tableString += "\n";
        }

        return tableString;
    }

    public double average() {
        int sumNumbers = 0;

        for (int indexRow = 0; indexRow < rowCount; ++indexRow) {
            for (int indexColumn = 0; indexColumn < columnCount; ++indexColumn) {
                sumNumbers += tableNumbers[indexRow][indexColumn];
            }
        }

        return (double)sumNumbers / (rowCount * columnCount);
    }
}
