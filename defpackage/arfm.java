package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arfm extends aonm implements aooz {
    public static final arfm a;
    private static volatile aopf l;
    public int b;
    public arfs d;
    public boolean f;
    public int g;
    public apxf h;
    public aots i;
    private aota m;
    private byte n = 2;
    public String c = "";
    public String e = "";
    public String j = "";
    public aomf k = aomf.b;

    static {
        arfm arfmVar = new arfm();
        a = arfmVar;
        aonm.registerDefaultInstance(arfm.class, arfmVar);
    }

    private arfm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဌ\u0004\u0004ᐉ\u0005\u0005ᐉ\b\u0006ည\t\u0007ဈ\u0002\bဇ\u0003\tဈ\u0007\nဉ\u0006", new Object[]{"b", "c", "d", "g", aqze.u, "h", "m", "k", "e", "f", "j", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new arfm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (arfm.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
