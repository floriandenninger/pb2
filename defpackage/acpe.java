package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acpe implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ Thread.UncaughtExceptionHandler a;
    final /* synthetic */ acpf b;

    public acpe(acpf acpfVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = acpfVar;
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        final acpf acpfVar = this.b;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        zga.f(acpf.a, "APP CRASHED!", th);
        long j = ((awuv) ((ywr) acpfVar.c.get()).c()).e;
        long c = acpfVar.b.c();
        if (j > c || c - j >= 10000) {
            final Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            if (afsn.b(th2)) {
                th2 = afsn.a(th2);
            }
            try {
                ((ywr) acpfVar.c.get()).b(new amml() { // from class: acpd
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        aomf aomfVar;
                        acpf acpfVar2 = acpf.this;
                        Throwable th3 = th2;
                        awuv awuvVar = (awuv) obj;
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            objectOutputStream.writeObject(th3);
                            objectOutputStream.flush();
                            aomfVar = aomf.x(byteArrayOutputStream.toByteArray());
                        } catch (IOException unused) {
                            zga.f(acpf.a, "Failed to serialize throwable.", th3);
                            aomfVar = null;
                        }
                        if (aomfVar == null) {
                            return awuvVar;
                        }
                        aone builder = awuvVar.toBuilder();
                        builder.copyOnWrite();
                        awuv awuvVar2 = (awuv) builder.instance;
                        awuvVar2.b |= 2;
                        awuvVar2.d = aomfVar;
                        long c2 = acpfVar2.b.c();
                        builder.copyOnWrite();
                        awuv awuvVar3 = (awuv) builder.instance;
                        awuvVar3.b |= 4;
                        awuvVar3.e = c2;
                        return (awuv) builder.build();
                    }
                }).get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e) {
                afsi.c(1, 12, "Failed to save the last crash exception.", e);
            }
        } else {
            try {
                ((ywr) acpfVar.c.get()).b(new amml() { // from class: acpc
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        acpf acpfVar2 = acpf.this;
                        aone builder = ((awuv) obj).toBuilder();
                        long c2 = acpfVar2.b.c();
                        builder.copyOnWrite();
                        awuv awuvVar = (awuv) builder.instance;
                        awuvVar.b |= 4;
                        awuvVar.e = c2;
                        return (awuv) builder.build();
                    }
                }).get(1L, TimeUnit.SECONDS);
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            } catch (Exception unused3) {
                zga.b("Failed to write the last exception time");
            }
            zga.c(acpf.a, "APP CRASHED RECENTLY.  Ignore!!!");
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
