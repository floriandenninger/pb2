package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.libraries.social.licenses.License;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.youtube.R;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vac extends ce implements apv {
    public ArrayAdapter a;
    public LicenseMenuActivity b;

    @Override // defpackage.ce
    public final void V() {
        super.V();
        apw supportLoaderManager = C().getSupportLoaderManager();
        if (supportLoaderManager.b.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (apw.b(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("destroyLoader in ");
                sb.append(supportLoaderManager);
                sb.append(" of 54321");
            }
            apx b = supportLoaderManager.b.b();
            if (b != null) {
                b.o();
                supportLoaderManager.b.b.l(54321);
                return;
            }
            return;
        }
        throw new IllegalStateException("destroyLoader must be called on the main thread");
    }

    @Override // defpackage.ce
    public final void aa(View view, Bundle bundle) {
        ci C = C();
        this.a = new ArrayAdapter(C, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        apw supportLoaderManager = C.getSupportLoaderManager();
        if (supportLoaderManager.b.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        apx b = supportLoaderManager.b.b();
        if (apw.b(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("initLoader in ");
            sb.append(supportLoaderManager);
            sb.append(": args=");
            sb.append((Object) null);
        }
        if (b == null) {
            try {
                supportLoaderManager.b.c = true;
                aqc aqcVar = new aqc(C());
                if (aqcVar.getClass().isMemberClass() && !Modifier.isStatic(aqcVar.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + aqcVar);
                }
                apx apxVar = new apx(aqcVar);
                if (apw.b(3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Created new loader ");
                    sb2.append(apxVar);
                }
                supportLoaderManager.b.b.k(54321, apxVar);
                supportLoaderManager.b.a();
                apxVar.p(supportLoaderManager.a, this);
            } catch (Throwable th) {
                supportLoaderManager.b.a();
                throw th;
            }
        } else {
            if (apw.b(3)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("  Re-using existing loader ");
                sb3.append(b);
            }
            b.p(supportLoaderManager.a, this);
        }
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.a);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: vab
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                vac vacVar = vac.this;
                License license = (License) adapterView.getItemAtPosition(i);
                LicenseMenuActivity licenseMenuActivity = vacVar.b;
                if (licenseMenuActivity != null) {
                    Intent intent = new Intent(licenseMenuActivity, (Class<?>) LicenseActivity.class);
                    intent.putExtra("license", license);
                    licenseMenuActivity.startActivity(intent);
                }
            }
        });
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        ci C = C();
        if (C instanceof LicenseMenuActivity) {
            this.b = (LicenseMenuActivity) C;
        }
    }

    @Override // defpackage.ce
    public final void lY() {
        super.lY();
        this.b = null;
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }
}
