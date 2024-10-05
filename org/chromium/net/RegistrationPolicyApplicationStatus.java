package org.chromium.net;

import defpackage.badn;
import org.chromium.base.ApplicationStatus;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RegistrationPolicyApplicationStatus extends NetworkChangeNotifierAutoDetect.RegistrationPolicy implements badn {
    private boolean mDestroyed;

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    protected void destroy() {
        if (this.mDestroyed) {
            return;
        }
        if (ApplicationStatus.b != null) {
            ApplicationStatus.b.c(this);
        }
        this.mDestroyed = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.init(networkChangeNotifierAutoDetect);
        ApplicationStatus.a(this);
        onApplicationStateChange(0);
    }

    public void onApplicationStateChange(int i) {
        ApplicationStatus.hasVisibleActivities();
        unregister();
    }
}
