package defpackage;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.protos.youtube.api.innertube.RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
import java.io.File;
import java.io.IOException;
import org.webrtc.PeerConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnh {
    public final Context a;
    public final ysl b;
    public PeerConnection c;
    public RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand d;
    private int e;

    public acnh(Context context, ysl yslVar) {
        this.a = context;
        this.b = yslVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        File file = new File(this.a.getFilesDir(), "rtc_event_logs/");
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                String.valueOf(String.valueOf(file2)).length();
                file2.delete();
            }
        }
        file.delete();
        this.e = 0;
    }

    public final void b(PeerConnection peerConnection) {
        this.c = peerConnection;
        c();
    }

    public final void c() {
        RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand recordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
        if (this.c == null || (recordStreamEventsCommandOuterClass$RecordStreamEventsCommand = this.d) == null || this.e >= recordStreamEventsCommandOuterClass$RecordStreamEventsCommand.c) {
            return;
        }
        File filesDir = this.a.getFilesDir();
        int i = this.e;
        StringBuilder sb = new StringBuilder(26);
        sb.append("rtc_event_logs/");
        sb.append(i);
        File file = new File(filesDir, sb.toString());
        String.valueOf(String.valueOf(file)).length();
        try {
            new File(this.a.getFilesDir(), "rtc_event_logs/").mkdirs();
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 1006632960);
            this.c.nativeStopRtcEventLog();
            this.c.nativeStartRtcEventLog(open.detachFd(), (int) this.d.b);
            this.e++;
        } catch (IOException e) {
            zga.f("RtcEventLogger", "Failed to create a new rtc event log file ", e);
        }
    }
}
