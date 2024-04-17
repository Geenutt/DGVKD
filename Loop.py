def main():
    while True:
        # Hiển thị menu cho người dùng
        print("Chọn một trong các phép tính sau:")
        print("1. Cộng")
        print("2. Trừ")
        print("3. Nhân")
        print("4. Chia")
        print("5. Thoát")

        # Yêu cầu người dùng chọn một phép tính
        choice = input("Nhập lựa chọn của bạn: ")

        # Kiểm tra lựa chọn của người dùng và thực hiện phép tính tương ứng
        if choice == '1':
            add()
        elif choice == '2':
            subtract()
        elif choice == '3':
            multiply()
        elif choice == '4':
            divide()
        elif choice == '5':
            print("Tạm biệt!")
            break
        else:
            print("Lựa chọn không hợp lệ. Vui lòng chọn lại.")

def add():
    num1 = float(input("Nhập số thứ nhất: "))
    num2 = float(input("Nhập số thứ hai: "))
    print("Tổng:", num1 + num2)

def subtract():
    num1 = float(input("Nhập số thứ nhất: "))
    num2 = float(input("Nhập số thứ hai: "))
    print("Hiệu:", num1 - num2)

def multiply():
    num1 = float(input("Nhập số thứ nhất: "))
    num2 = float(input("Nhập số thứ hai: "))
    print("Tích:", num1 * num2)

def divide():
    num1 = float(input("Nhập số thứ nhất: "))
    num2 = float(input("Nhập số thứ hai: "))
    if num2 == 0:
        print("Không thể chia cho 0.")
    else:
        print("Thương:", num1 / num2)

if __name__ == "__main__":
    main()