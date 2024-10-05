package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apfa extends aonm implements aooz {
    public static final apfa a;
    private static volatile aopf f;
    public long b;
    public long c;
    public avgg d;
    private int g;
    private aota h;
    private apxf i;
    private aulq j;
    private byte k = 2;
    public aomf e = aomf.b;

    static {
        apfa apfaVar = new apfa();
        a = apfaVar;
        aonm.registerDefaultInstance(apfa.class, apfaVar);
    }

    private apfa() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0004\u0001ဂ\u0000\u0002ဂ\u0001\u0006ᐉ\u0002\bᐉ\u0003\tည\u0004\nᐉ\u0005\fᐉ\u0007", new Object[]{"g", "b", "c", "d", "h", "e", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new apfa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (apfa.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
