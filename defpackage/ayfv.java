package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayfv {
    static final Logger a = Logger.getLogger(axzq.class.getName());
    public final Object b = new Object();
    public final aybc c;

    public ayfv(aybc aybcVar, long j, String str) {
        str.getClass();
        aybcVar.getClass();
        this.c = aybcVar;
        ayau ayauVar = new ayau();
        ayauVar.a = str.concat(" created");
        ayauVar.b = ayav.CT_INFO;
        ayauVar.b(j);
        b(ayauVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(aybc aybcVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            String valueOf = String.valueOf(aybcVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3 + String.valueOf(str).length());
            sb.append("[");
            sb.append(valueOf);
            sb.append("] ");
            sb.append(str);
            LogRecord logRecord = new LogRecord(level, sb.toString());
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ayax ayaxVar) {
        Level level;
        ayav ayavVar = ayav.CT_UNKNOWN;
        int ordinal = ayaxVar.b.ordinal();
        if (ordinal != 2) {
            level = ordinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.b) {
        }
        a(this.c, level, ayaxVar.a);
    }
}
