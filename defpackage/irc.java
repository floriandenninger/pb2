package defpackage;

import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class irc implements Runnable {
    public final /* synthetic */ UploadActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ irc(UploadActivity uploadActivity, int i) {
        this.b = i;
        this.a = uploadActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            UploadActivity uploadActivity = this.a;
            uploadActivity.D(uploadActivity.W);
            return;
        }
        if (i == 1) {
            UploadActivity uploadActivity2 = this.a;
            irz irzVar = uploadActivity2.s;
            for (alca alcaVar : irzVar.C) {
                irzVar.F.i(alcaVar.e(), avto.UPLOAD_FRONTEND_EVENT_TYPE_ZERO_STEP_CHANNEL_CREATION_FAILED, alcaVar.h(), alcaVar.f());
            }
            uploadActivity2.Y.a();
            uploadActivity2.Z.b(true);
            return;
        }
        UploadActivity uploadActivity3 = this.a;
        irz irzVar2 = uploadActivity3.s;
        for (alca alcaVar2 : irzVar2.C) {
            irzVar2.F.i(alcaVar2.e(), avto.UPLOAD_FRONTEND_EVENT_TYPE_ZERO_STEP_CHANNEL_CREATION_COMPLETED, alcaVar2.h(), alcaVar2.f());
        }
        uploadActivity3.G();
        uploadActivity3.Y.a();
        uploadActivity3.Z.b(true);
        uploadActivity3.v();
    }
}
