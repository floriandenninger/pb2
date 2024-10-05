package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auhw extends aonm implements aooz {
    public static final auhw a;
    private static volatile aopf q;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public arfs f;
    public avgg g;
    public apxf h;
    public atdf j;
    public auhv k;
    public long l;
    public long m;
    public aoxy n;
    private aota r;
    private byte s = 2;
    public aony i = emptyProtobufList();
    public aomf o = aomf.b;
    public String p = "";

    static {
        auhw auhwVar = new auhw();
        a = auhwVar;
        aonm.registerDefaultInstance(auhw.class, auhwVar);
    }

    private auhw() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.s);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007Л\bᐉ\u0006\tᐉ\u000b\nည\f\u000bဉ\u0007\fဂ\b\rဂ\t\u000eᐉ\n\u000fဈ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", apxf.class, "j", "r", "o", "k", "l", "m", "n", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new auhw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (auhw.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
