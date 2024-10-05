package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awdp extends aonm implements aooz {
    public static final awdp a;
    private static volatile aopf z;
    private awdm A;
    public int b;
    public int c;
    public int f;
    public boolean h;
    public boolean i;
    public float j;
    public float k;
    public String l;
    public awdq m;
    public int n;
    public atsn o;
    public awds p;
    public awdh q;
    public boolean s;
    public awdg t;
    public int u;
    public boolean v;
    public awdk w;
    public aomf x;
    public awdn y;
    public aoot r = aoot.a;
    private byte B = 2;
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        awdp awdpVar = new awdp();
        a = awdpVar;
        aonm.registerDefaultInstance(awdp.class, awdpVar);
    }

    private awdp() {
        emptyProtobufList();
        this.l = "";
        this.x = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.B);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.B = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0002\u0001\uf49c䄩\u0017\u0001\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0005ဈ\u0004\u0006ဇ\u0005\u0007ခ\u0007\bခ\b\tဈ\t\fဌ\r\u0010ဉ\u0014\u00122\u0014ဇ\u0018\u0015ᐉ\u0019\u0016ဌ\u001a\u0017ဇ\u001b\u0019ဇ\u0006\u001aဉ\u001d\u001cည\u001f\u001dဉ \uf70f⁾ဉ\n\ue8f4☔ဉ\u000e\uf1b8㴗ဉ\u0011\uf49c䄩ᐉ\u0013", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "n", avya.t, "q", "r", awdo.a, "s", "t", "u", atnn.r, "v", "i", "w", "x", "y", "m", "o", "p", "A"});
            case NEW_MUTABLE_INSTANCE:
                return new awdp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = z;
                if (aopfVar == null) {
                    synchronized (awdp.class) {
                        aopfVar = z;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            z = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
