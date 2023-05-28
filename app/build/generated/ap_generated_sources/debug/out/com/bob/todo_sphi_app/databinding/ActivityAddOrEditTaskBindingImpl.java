package com.bob.todo_sphi_app.databinding;
import com.bob.todo_sphi_app.R;
import com.bob.todo_sphi_app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddOrEditTaskBindingImpl extends ActivityAddOrEditTaskBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.et_task_description, 1);
        sViewsWithIds.put(R.id.tv_priority_label, 2);
        sViewsWithIds.put(R.id.rg_priority, 3);
        sViewsWithIds.put(R.id.rb_high_priority, 4);
        sViewsWithIds.put(R.id.rb_medium_priority, 5);
        sViewsWithIds.put(R.id.rb_low_priority, 6);
        sViewsWithIds.put(R.id.tv_due_date_label, 7);
        sViewsWithIds.put(R.id.dp_due_date, 8);
        sViewsWithIds.put(R.id.rg_due_date, 9);
        sViewsWithIds.put(R.id.rb_no_due_date, 10);
        sViewsWithIds.put(R.id.rb_select_due_date, 11);
        sViewsWithIds.put(R.id.rb_invisible_for_lining_up, 12);
        sViewsWithIds.put(R.id.btn_add_or_update_task, 13);
        sViewsWithIds.put(R.id.tv_completion_label, 14);
        sViewsWithIds.put(R.id.cb_task_completed, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAddOrEditTaskBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityAddOrEditTaskBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[13]
            , (android.widget.CheckBox) bindings[15]
            , (android.widget.DatePicker) bindings[8]
            , (android.widget.EditText) bindings[1]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.RadioButton) bindings[12]
            , (android.widget.RadioButton) bindings[6]
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.RadioButton) bindings[11]
            , (android.widget.RadioGroup) bindings[9]
            , (android.widget.RadioGroup) bindings[3]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}