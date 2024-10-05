package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atvw extends aonm implements aooz {
    public static final atvw a;
    private static volatile aopf m;
    public int b;
    public apxf e;
    public aqyg f;
    public arfs g;
    public atvv h;
    public atvu i;
    public int k;
    public aulq l;
    private apxf n;
    private aota o;
    private byte p = 2;
    public String c = "";
    public String d = "";
    public aomf j = aomf.b;

    static {
        atvw atvwVar = new atvw();
        a = atvwVar;
        aonm.registerDefaultInstance(atvw.class, atvwVar);
    }

    private atvw() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0007\u0001ဈ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0005ᐉ\u0006\u0006ဉ\u0007\u0007ᐉ\b\bᐉ\t\tည\n\nဈ\u0001\u000bဌ\u000b\fᐉ\f\u000eᐉ\u0003", new Object[]{"b", "c", "e", "f", "g", "h", "i", "o", "j", "d", "k", atvx.a(), "l", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new atvw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (atvw.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
