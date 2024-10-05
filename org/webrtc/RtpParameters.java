package org.webrtc;

import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RtpParameters {
    public final String a;
    public DegradationPreference b;
    public final List c;
    public final List d;
    private final Rtcp e;
    private final List f;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class Codec {
        public int a;
        public String b;
        MediaStreamTrack.MediaType c;
        public Integer d;
        public Integer e;
        public Map f;

        Codec(int i, String str, MediaStreamTrack.MediaType mediaType, Integer num, Integer num2, Map map) {
            this.a = i;
            this.b = str;
            this.c = mediaType;
            this.d = num;
            this.e = num2;
            this.f = map;
        }

        Integer getClockRate() {
            return this.d;
        }

        MediaStreamTrack.MediaType getKind() {
            return this.c;
        }

        String getName() {
            return this.b;
        }

        Integer getNumChannels() {
            return this.e;
        }

        Map getParameters() {
            return this.f;
        }

        int getPayloadType() {
            return this.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum DegradationPreference {
        DISABLED,
        MAINTAIN_FRAMERATE,
        MAINTAIN_RESOLUTION,
        BALANCED;

        static DegradationPreference fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class Encoding {
        public String a;
        public boolean b;
        public double c;
        public int d;
        public Integer e;
        public Integer f;
        public Integer g;
        public Integer h;
        public Double i;
        public Long j;
        public boolean k;

        Encoding(String str, boolean z, double d, int i, Integer num, Integer num2, Integer num3, Integer num4, Double d2, Long l, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = d;
            this.d = i;
            this.e = num;
            this.f = num2;
            this.g = num3;
            this.h = num4;
            this.i = d2;
            this.j = l;
            this.k = z2;
        }

        boolean getActive() {
            return this.b;
        }

        boolean getAdaptivePTime() {
            return this.k;
        }

        double getBitratePriority() {
            return this.c;
        }

        Integer getMaxBitrateBps() {
            return this.e;
        }

        Integer getMaxFramerate() {
            return this.g;
        }

        Integer getMinBitrateBps() {
            return this.f;
        }

        int getNetworkPriority() {
            return this.d;
        }

        Integer getNumTemporalLayers() {
            return this.h;
        }

        String getRid() {
            return this.a;
        }

        Double getScaleResolutionDownBy() {
            return this.i;
        }

        Long getSsrc() {
            return this.j;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class HeaderExtension {
        private final String a;
        private final int b;
        private final boolean c;

        HeaderExtension(String str, int i, boolean z) {
            this.a = str;
            this.b = i;
            this.c = z;
        }

        public boolean getEncrypted() {
            return this.c;
        }

        public int getId() {
            return this.b;
        }

        public String getUri() {
            return this.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class Rtcp {
        private final String a;
        private final boolean b;

        Rtcp(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String getCname() {
            return this.a;
        }

        public boolean getReducedSize() {
            return this.b;
        }
    }

    RtpParameters(String str, DegradationPreference degradationPreference, Rtcp rtcp, List list, List list2, List list3) {
        this.a = str;
        this.b = degradationPreference;
        this.e = rtcp;
        this.f = list;
        this.c = list2;
        this.d = list3;
    }

    List getCodecs() {
        return this.d;
    }

    DegradationPreference getDegradationPreference() {
        return this.b;
    }

    List getEncodings() {
        return this.c;
    }

    public List getHeaderExtensions() {
        return this.f;
    }

    public Rtcp getRtcp() {
        return this.e;
    }

    String getTransactionId() {
        return this.a;
    }
}
