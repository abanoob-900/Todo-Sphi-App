package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.bob.todo_sphi_app.DataBinderMapperImpl());
  }
}
