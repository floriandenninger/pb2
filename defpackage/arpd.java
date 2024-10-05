package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arpd extends aonm implements aooz {
    public static final arpd a;
    private static volatile aopf o;
    public int b;
    public arnb c;
    public int e;
    public boolean j;
    public int k;
    public boolean l;
    public int m;
    public long n;
    private byte p = 2;
    public String d = "";
    public aomf f = aomf.b;
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        arpd arpdVar = new arpd();
        a = arpdVar;
        aonm.registerDefaultInstance(arpd.class, arpdVar);
    }

    private arpd() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007\tဋ\b\u000bဇ\n\fဌ\u000b\rဂ\f", new Object[]{"b", "c", "d", "e", aqtk.q, "f", "g", "h", "i", "j", "k", "l", "m", aqtk.s, "n"});
            case NEW_MUTABLE_INSTANCE:
                return new arpd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (arpd.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
