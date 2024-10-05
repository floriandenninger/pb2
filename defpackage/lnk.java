package defpackage;

import com.google.android.apps.youtube.app.settings.accessibility.AccessibilitySettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class lnk extends ml implements axql {
    private volatile axps a;
    private final Object b = new Object();
    private boolean c = false;

    public lnk() {
        addOnContextAvailableListener(new lnj(this));
    }

    public void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        AccessibilitySettingsActivity accessibilitySettingsActivity = (AccessibilitySettingsActivity) this;
        eed eedVar = (eed) lM();
        accessibilitySettingsActivity.a = (gni) eedVar.a.eA.get();
        accessibilitySettingsActivity.b = (acra) eedVar.O.get();
    }

    @Override // defpackage.axql
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final axps lL() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new axps(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.zv, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.u(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }
}
