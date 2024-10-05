package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqvb extends aonm implements aooz {
    public static final aonv a = new uct(17);
    private static volatile aopf aJ;
    public static final aqvb b;
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f100J;
    public boolean K;
    public long L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public long U;
    public boolean V;
    public boolean W;
    public boolean X;
    public aony Y;
    public boolean Z;
    public boolean aA;
    public boolean aB;
    public boolean aC;
    public boolean aD;
    public boolean aE;
    public boolean aF;
    public boolean aG;
    public boolean aH;
    public boolean aI;
    private int aK;
    private int aL;
    private int aM;
    public long aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public long ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    public boolean ai;
    public int aj;
    public aonu ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public int ao;
    public float ap;
    public int aq;
    public int ar;
    public boolean as;
    public int at;
    public boolean au;
    public boolean av;
    public boolean aw;
    public int ax;
    public boolean ay;
    public boolean az;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public boolean r;
    public aonu s = emptyIntList();
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    static {
        aqvb aqvbVar = new aqvb();
        b = aqvbVar;
        aonm.registerDefaultInstance(aqvb.class, aqvbVar);
    }

    private aqvb() {
        emptyIntList();
        this.Y = aonm.emptyProtobufList();
        emptyIntList();
        this.ak = emptyIntList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001T\u0000\u0004\u0001\u0084T\u0000\u0003\u0000\u0001ဇ\u0000\u0002င\u0001\u0006ဇ\u0005\u0007ဇ\u0006\u000bင\n\fဇ\u000b\rဇ\f\u000eဇ\r\u0011ဇ\u0010\u0018င\u0017\u001aင\u0019\u001bင\u001a\u001cဇ\u001b\u001fဌ\u001e ဇ\u001f!\u001e#ဇ!$ဇ\"%ဇ#&ဇ$'ဇ%*င*,ဇ,0ဇ01ဇ12င23င34ဌ55ဇ66ဇ77င88ဇ9:ဇ;;ဂ<>ဇ=@ဇ@AဇACဇBDဂCEဇDFဇEGဇFIဂHMဇIOဇKTဇOU\u001aVဇPXဂQZဇS\\ဇU]ဇV^ဂW_ဇX`ဇYaဇZbဇ[cင\\d\u0016eဇ]fဇ^gဇ_hင`iခajငbkငclဇdmငeqဇirဇjsဇkvဇ)wငlxဇmzဇo{ဇp|ဇq}ဇr\u007fဇt\u0080ဇu\u0081ဇv\u0082ဇw\u0083ဇx\u0084ဇy", new Object[]{"aK", "aL", "aM", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", apew.h, "r", "s", aqva.a(), "t", "u", "v", "w", "x", "z", "A", "B", "C", "D", "E", "F", aquw.e, "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an", "ao", "ap", "aq", "ar", "as", "at", "au", "av", "aw", "y", "ax", "ay", "az", "aA", "aB", "aC", "aD", "aE", "aF", "aG", "aH", "aI"});
            case NEW_MUTABLE_INSTANCE:
                return new aqvb();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = aJ;
                if (aopfVar == null) {
                    synchronized (aqvb.class) {
                        aopfVar = aJ;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            aJ = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
