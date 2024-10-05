package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apek extends aonm implements aooz {
    public static final apek a;
    private static volatile aopf u;
    public int b;
    public int e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public avgg j;
    public boolean l;
    public boolean m;
    public boolean p;
    public boolean q;
    public int s;
    public int t;
    private byte v = 2;
    public String c = "";
    public int d = 99;
    public String k = "";
    public boolean n = true;
    public boolean o = true;
    public String r = "";

    static {
        apek apekVar = new apek();
        a = apekVar;
        aonm.registerDefaultInstance(apek.class, apekVar);
    }

    private apek() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.v);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u001b\u0012\u0000\u0000\u0005\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\nဈ\b\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဈ\u000f\u0017င\u0011\u0019ဇ\t\u001aဌ\u0010\u001bဇ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "r", "t", "l", "s", atmj.f, "q"});
            case NEW_MUTABLE_INSTANCE:
                return new apek();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = u;
                if (aopfVar == null) {
                    synchronized (apek.class) {
                        aopfVar = u;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            u = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
