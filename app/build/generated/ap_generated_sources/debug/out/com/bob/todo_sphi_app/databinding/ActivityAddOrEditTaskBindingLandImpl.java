package com.bob.todo_sphi_app.databinding;
import com.bob.todo_sphi_app.R;
import com.bob.todo_sphi_app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddOrEditTaskBindingLandImpl extends ActivityAddOrEditTaskBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.dp_due_date, 1);
        sViewsWithIds.put(R.id.et_task_description, 2);
        sViewsWithIds.put(R.id.tv_priority_label, 3);
        sViewsWithIds.put(R.id.rg_priority, 4);
        sViewsWithIds.put(R.id.rb_high_priority, 5);
        sViewsWithIds.put(R.id.rb_medium_priority, 6);
        sViewsWithIds.put(R.id.rb_low_priority, 7);
        sViewsWithIds.put(R.id.tv_due_date_label, 8);
        sViewsWithIds.put(R.id.rg_due_date, 9);
        sViewsWithIds.put(R.id.rb_no_due_date, 10);
        sViewsWithIds.put(R.id.rb_select_due_date, 11);
        sViewsWithIds.put(R.id.btn_add_or_update_task, 12);
        sViewsWithIds.put(R.id.tv_completion_label, 13);
        sViewsWithIds.put(R.id.cb_task_completed, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAddOrEditTaskBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityAddOrEditTaskBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[12]
            , (android.widget.CheckBox) bindings[14]
            , (android.widget.DatePicker) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.RadioButton) bindings[5]
            , null
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.RadioButton) bindings[6]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.RadioButton) bindings[11]
            , (android.widget.RadioGroup) bindings[9]
            , (android.widget.RadioGroup) bindings[4]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
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