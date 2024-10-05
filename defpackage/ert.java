package defpackage;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ert extends ArrayAdapter {
    public final aahd a;
    public final akgl b;
    private final Context c;

    public ert(Context context, aahd aahdVar, List list, akgl akglVar) {
        super(context, 0);
        this.c = context;
        this.a = aahdVar;
        this.b = akglVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aprj aprjVar = (aprj) it.next();
            if ((aprjVar.b & 1) != 0) {
                aupu aupuVar = aprjVar.c;
                add(aupuVar == null ? aupu.a : aupuVar);
            }
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        aqyg aqygVar;
        if (view == null) {
            view = LayoutInflater.from(this.c).inflate(R.layout.channel_profile_editor_boolean_setting_field, viewGroup, false);
        }
        final aupu aupuVar = (aupu) getItem(i);
        TextView textView = (TextView) view.findViewById(R.id.title);
        if ((aupuVar.b & 16) != 0) {
            aqygVar = aupuVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.toggle);
        switchCompat.setOnCheckedChangeListener(null);
        switchCompat.setChecked(this.b.g(aupuVar));
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ers
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                apxf apxfVar;
                ert ertVar = ert.this;
                aupu aupuVar2 = aupuVar;
                ertVar.b.d(aupuVar2, z);
                if (z) {
                    apxfVar = aupuVar2.h;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                } else {
                    apxfVar = aupuVar2.i;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                }
                ertVar.a.a(apxfVar);
            }
        });
        return view;
    }
}
