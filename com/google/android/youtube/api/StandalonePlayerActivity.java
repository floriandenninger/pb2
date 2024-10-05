package com.google.android.youtube.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import defpackage.afkp;
import defpackage.aifz;
import defpackage.alta;
import defpackage.alur;
import defpackage.alvk;
import defpackage.alvu;
import defpackage.oba;
import defpackage.osv;
import defpackage.otb;
import defpackage.otc;
import defpackage.ove;
import defpackage.ovf;
import defpackage.owl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StandalonePlayerActivity extends Activity implements otc {
    private static StandalonePlayerActivity a;
    private WatchDescriptor b;
    private PlaybackStartDescriptor c;
    private boolean d;
    private boolean e;
    private boolean f;
    private osv g;
    private ove h;
    private ovf i;
    private String j;
    private String k;

    @Override // defpackage.otc
    public final void a(osv osvVar) {
        this.g = osvVar;
        if (!TextUtils.isEmpty(this.j)) {
            osvVar.g(this.j, new alur(this));
        } else {
            c();
        }
    }

    @Override // defpackage.otc
    public final void b(Exception exc) {
        Intent intent = new Intent();
        intent.putExtra("initialization_result", alta.E(otb.l(exc)));
        setResult(1, intent);
        finish();
    }

    public final void c() {
        if (isFinishing()) {
            return;
        }
        osv osvVar = this.g;
        otb otbVar = (otb) osvVar;
        otbVar.i = this.k;
        ove oveVar = new ove(this, osvVar, new afkp(this, otbVar.f.G()));
        this.h = oveVar;
        oveVar.ap(true);
        if (((owl) this.b.b.instance).d) {
            this.h.ao(new alvk(this));
        }
        View view = (View) alvu.b(this.h.J());
        if (view == null) {
            b(new IllegalStateException("Could not get player view."));
            return;
        }
        ovf ovfVar = new ovf(this, view, this.h, this.c, this.d, this.e, this.f);
        this.i = ovfVar;
        ovfVar.show();
        this.h.K(8);
        this.h.am((this.d || this.f) ? false : true);
        Intent intent = new Intent();
        intent.putExtra("initialization_result", "SUCCESS");
        setResult(-1, intent);
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        PlaybackStartDescriptor a2;
        StandalonePlayerActivity standalonePlayerActivity = a;
        if (standalonePlayerActivity != null) {
            standalonePlayerActivity.finish();
        }
        a = this;
        Intent intent = getIntent();
        WatchDescriptor watchDescriptor = (WatchDescriptor) intent.getParcelableExtra("watch");
        boolean z = false;
        if (watchDescriptor == null) {
            String stringExtra = intent.getStringExtra("video_id");
            String stringExtra2 = intent.getStringExtra("playlist_id");
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("video_ids");
            int intExtra = intent.getIntExtra("current_index", 0);
            int intExtra2 = intent.getIntExtra("start_time_millis", 0);
            boolean booleanExtra = intent.getBooleanExtra("autoplay", false);
            if (stringArrayListExtra != null) {
                a2 = oba.x(stringArrayListExtra, intExtra, intExtra2);
            } else if (stringExtra2 != null) {
                a2 = oba.v(stringExtra2, intExtra, intExtra2);
            } else if (stringExtra != null) {
                a2 = oba.w(stringExtra, intExtra2);
            } else {
                a2 = PlaybackStartDescriptor.d().a();
            }
            aifz e = a2.e();
            e.d = booleanExtra;
            e.b(!booleanExtra);
            WatchDescriptor watchDescriptor2 = new WatchDescriptor(e.a());
            this.b = watchDescriptor2;
            this.c = watchDescriptor2.a;
        } else {
            this.b = watchDescriptor;
            PlaybackStartDescriptor playbackStartDescriptor = watchDescriptor.a;
            if (!TextUtils.isEmpty(playbackStartDescriptor.l())) {
                playbackStartDescriptor = oba.w(playbackStartDescriptor.l(), playbackStartDescriptor.c());
            } else if (!TextUtils.isEmpty(playbackStartDescriptor.k())) {
                playbackStartDescriptor = oba.v(playbackStartDescriptor.k(), playbackStartDescriptor.a(), playbackStartDescriptor.c());
            } else {
                List m = playbackStartDescriptor.m();
                if (m != null) {
                    if (m.size() == 1) {
                        playbackStartDescriptor = oba.w((String) m.get(0), playbackStartDescriptor.c());
                    } else {
                        playbackStartDescriptor = oba.x(m, playbackStartDescriptor.a(), playbackStartDescriptor.c());
                    }
                } else {
                    alta.C("Invalid PlaybackStartDescriptor. Returning the instance itself.", new Object[0]);
                }
            }
            this.c = playbackStartDescriptor;
        }
        this.d = intent.getBooleanExtra("lightbox_mode", false);
        this.e = intent.getBooleanExtra("window_has_status_bar", false);
        if (Build.VERSION.SDK_INT >= 24 && isInMultiWindowMode()) {
            z = true;
        }
        this.f = z;
        super.onCreate(bundle);
        if (!this.d && !this.f) {
            setRequestedOrientation(6);
        }
        String stringExtra3 = intent.getStringExtra("developer_key");
        String stringExtra4 = intent.getStringExtra("app_version");
        String stringExtra5 = intent.getStringExtra("client_library_version");
        if (stringExtra5 == null) {
            stringExtra5 = "1.0.0";
        }
        String str = stringExtra5;
        if (!str.matches("^(\\d+\\.){2}(\\d+)(\\w?)$")) {
            b(new IllegalStateException("Invalid client version"));
            return;
        }
        String callingPackage = getCallingPackage();
        String stringExtra6 = callingPackage != null ? callingPackage : intent.getStringExtra("app_package");
        this.k = (TextUtils.isEmpty(stringExtra6) || TextUtils.equals(stringExtra6, "com.google.android.youtube")) ? intent.getStringExtra("referring_app_package") : stringExtra6;
        this.j = "com.google.android.music".equals(callingPackage) ? intent.getStringExtra("google_account_name") : null;
        if (stringExtra3 == null) {
            b(new IllegalArgumentException("App developer key cannot be null or empty"));
            return;
        }
        if (stringExtra6 == null) {
            b(new IllegalArgumentException("App package name cannot be null or empty"));
        } else if (stringExtra4 == null) {
            b(new IllegalArgumentException("App version name cannot be null or empty"));
        } else {
            otb.n(this, new Handler(getMainLooper()), this, stringExtra3, stringExtra6, stringExtra4, str, !TextUtils.isEmpty(r13), 3);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        ove oveVar = this.h;
        if (oveVar != null) {
            oveVar.am(false);
            this.h.al(isFinishing());
        }
        ovf ovfVar = this.i;
        if (ovfVar != null && ovfVar.isShowing()) {
            this.i.dismiss();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ove oveVar = this.h;
        return (oveVar != null && oveVar.aw(i, keyEvent)) || super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        ove oveVar = this.h;
        return (oveVar != null && oveVar.ax(i, keyEvent)) || super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        ove oveVar = this.h;
        if (oveVar != null) {
            oveVar.ah();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        ove oveVar = this.h;
        if (oveVar != null) {
            oveVar.ai();
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        ove oveVar = this.h;
        if (oveVar != null) {
            oveVar.aj();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        if (a == this) {
            a = null;
        }
        ove oveVar = this.h;
        if (oveVar != null) {
            oveVar.ak();
        }
        super.onStop();
    }
}
