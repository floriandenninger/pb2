package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aapi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NetworkOperationView extends FrameLayout {
    public TextView a;
    public TextView b;
    public int c;
    private Button d;
    private Button e;
    private ProgressBar f;
    private WaitingIndicatorView g;
    private boolean h;

    public NetworkOperationView(Context context) {
        super(context);
        this.c = -1;
        f(context);
    }

    private final void e() {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.b.setVisibility(8);
        this.b.setText("");
    }

    private final void f(Context context) {
        inflate(context, R.layout.lc_network_operation_view, this);
        this.d = (Button) findViewById(R.id.action_button_positive);
        this.e = (Button) findViewById(R.id.action_button_negative);
        this.a = (TextView) findViewById(R.id.error_message_text);
        this.f = (ProgressBar) findViewById(R.id.spinner);
        this.b = (TextView) findViewById(R.id.progress_indicator_text);
        this.g = (WaitingIndicatorView) findViewById(R.id.network_transition_spinner);
        a(0);
    }

    private final void g() {
        if (this.h) {
            this.f.setVisibility(8);
            this.g.setVisibility(0);
            this.g.a();
        } else {
            this.g.c();
            this.g.setVisibility(8);
            this.f.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.b.getText())) {
            return;
        }
        this.b.setVisibility(0);
    }

    public final void b(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    public final void c(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public final void d() {
        this.h = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        a(savedState.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.c;
        return savedState;
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new aapi(7);
        int a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NetworkOperationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1;
        f(context);
    }

    public NetworkOperationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = -1;
        f(context);
    }

    public final void a(int i) {
        this.c = i;
        if (i == 0) {
            g();
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.a.setVisibility(8);
            return;
        }
        if (i == 1) {
            e();
            this.d.setVisibility(0);
            this.e.setVisibility(0);
            this.a.setVisibility(0);
            return;
        }
        if (i == 2) {
            e();
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.a.setVisibility(8);
            return;
        }
        if (i == 4) {
            g();
            this.b.setVisibility(8);
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.a.setVisibility(0);
            return;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Unknown currentMode: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
