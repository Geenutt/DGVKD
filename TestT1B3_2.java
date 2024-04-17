import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class TestT1B3_2 {

    @Test
    public void testAdd() {
        final InputStream originalInput = System.in;
        final PrintStream originalOutput = System.out;

        ByteArrayInputStream in = new ByteArrayInputStream("1\n10\n20\n5\n".getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Tuan1_Bai3.main(null);

        assertEquals("Chọn một trong các phép tính sau:\n1. Cộng\n2. Trừ\n3. Nhân\n4. Chia\n5. Thoát\nNhập lựa chọn của bạn: Nhập số thứ nhất: Nhập số thứ hai: Tổng: 30.0\n", outContent.toString());

        System.setIn(originalInput);
        System.setOut(originalOutput);
    }

    @Test
    public void testSubtract() {
        final InputStream originalInput = System.in;
        final PrintStream originalOutput = System.out;

        ByteArrayInputStream in = new ByteArrayInputStream("2\n20\n10\n5\n".getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Tuan1_Bai3.main(null);

        assertEquals("Chọn một trong các phép tính sau:\n1. Cộng\n2. Trừ\n3. Nhân\n4. Chia\n5. Thoát\nNhập lựa chọn của bạn: Nhập số thứ nhất: Nhập số thứ hai: Hiệu: 10.0\n", outContent.toString());

        System.setIn(originalInput);
        System.setOut(originalOutput);
    }

    @Test
    public void testMultiply() {
        final InputStream originalInput = System.in;
        final PrintStream originalOutput = System.out;

        ByteArrayInputStream in = new ByteArrayInputStream("3\n10\n20\n5\n".getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Tuan1_Bai3.main(null);

        assertEquals("Chọn một trong các phép tính sau:\n1. Cộng\n2. Trừ\n3. Nhân\n4. Chia\n5. Thoát\nNhập lựa chọn của bạn: Nhập số thứ nhất: Nhập số thứ hai: Tích: 200.0\n", outContent.toString());

        System.setIn(originalInput);
        System.setOut(originalOutput);
    }

    @Test
    public void testDivide() {
        final InputStream originalInput = System.in;
        final PrintStream originalOutput = System.out;

        ByteArrayInputStream in = new ByteArrayInputStream("4\n10\n2\n5\n".getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Tuan1_Bai3.main(null);

        assertEquals("Chọn một trong các phép tính sau:\n1. Cộng\n2. Trừ\n3. Nhân\n4. Chia\n5. Thoát\nNhập lựa chọn của bạn: Nhập số thứ nhất: Nhập số thứ hai: Thương: 5.0\n", outContent.toString());

        System.setIn(originalInput);
        System.setOut(originalOutput);
    }

    @Test
    public void testExit() {
        final InputStream originalInput = System.in;
        final PrintStream originalOutput = System.out;

        ByteArrayInputStream in = new ByteArrayInputStream("5\n".getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Tuan1_Bai3.main(null);

        assertEquals("Chọn một trong các phép tính sau:\n1. Cộng\n2. Trừ\n3. Nhân\n4. Chia\n5. Thoát\nNhập lựa chọn của bạn: Tạm biệt!\n", outContent.toString());

        System.setIn(originalInput);
        System.setOut(originalOutput);
    }

    @Test
    public void testInvalidChoice() {
        final InputStream originalInput = System.in;
        final PrintStream originalOutput = System.out;

        ByteArrayInputStream in = new ByteArrayInputStream("6\n5\n".getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Tuan1_Bai3.main(null);

        assertEquals("Chọn một trong các phép tính sau:\n1. Cộng\n2. Trừ\n3. Nhân\n4. Chia\n5. Thoát\nNhập lựa chọn của bạn: Lựa chọn không hợp lệ. Vui lòng chọn lại.\nChọn một trong các phép tính sau:\n1. Cộng\n2. Trừ\n3. Nhân\n4. Chia\n5. Thoát\nNhập lựa chọn của bạn: Tạm biệt!\n", outContent.toString());

        System.setIn(originalInput);
        System.setOut(originalOutput);
    }

    @Test
    public void testDivideByZero() {
        final InputStream originalInput = System.in;
        final PrintStream originalOutput = System.out;

        ByteArrayInputStream in = new ByteArrayInputStream("4\n10\n0\n5\n".getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Tuan1_Bai3.main(null);

        assertEquals("Chọn một trong các phép tính sau:\n1. Cộng\n2. Trừ\n3. Nhân\n4. Chia\n5. Thoát\nNhập lựa chọn của bạn: Nhập số thứ nhất: Nhập số thứ hai: Không thể chia cho 0.\n", outContent.toString());

        System.setIn(originalInput);
        System.setOut(originalOutput);
    }
}
