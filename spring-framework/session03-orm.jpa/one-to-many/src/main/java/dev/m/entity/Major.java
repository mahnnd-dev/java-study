package dev.m.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Major")
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class Major {
    @Id
    @Column(name = "Id")
    private String id;
    @Column(name = "Name")
    private String name;
    //    CascadeType.PERSIST: Khi bạn lưu (persist) một đối tượng cha, tất cả các đối tượng con liên quan cũng sẽ được lưu vào cơ sở dữ liệu.
//    CascadeType.MERGE: Khi bạn cập nhật (merge) một đối tượng cha, các thay đổi trên các đối tượng con cũng sẽ được cập nhật.
//    CascadeType.REMOVE: Khi bạn xóa (remove) một đối tượng cha, tất cả các đối tượng con liên quan cũng sẽ bị xóa. Đây là một thao tác nguy hiểm, cần thận trọng khi sử dụng.
//    CascadeType.REFRESH: Khi bạn làm mới (refresh) một đối tượng cha (để đồng bộ với dữ liệu trong database), các đối tượng con cũng sẽ được làm mới.
//    CascadeType.DETACH: Khi bạn tách (detach) một đối tượng cha khỏi bối cảnh quản lý (persistence context), các đối tượng con cũng sẽ được tách ra.
//    FetchType.EAGER Khi bạn tải một đối tượng, dữ liệu của tất cả các đối tượng liên quan cũng sẽ được tải ngay lập tức cùng lúc
//    FetchType.LAZY Dữ liệu của các đối tượng liên quan chỉ được tải khi bạn thực sự truy cập vào chúng lần đầu tiên
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "MajorId") // Tạo 1 cột MajorId tại Student
    private List<Student> students = new ArrayList<>();


    public Major(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
