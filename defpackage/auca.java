package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auca extends aonm implements aooz {
    public static final auca a;
    private static volatile aopf d;
    public aulq b;
    public boolean c;
    private int e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aulq i;
    private aulq j;
    private aota k;
    private byte l = 2;

    static {
        auca aucaVar = new auca();
        a = aucaVar;
        aonm.registerDefaultInstance(auca.class, aucaVar);
    }

    private auca() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\n\bᐉ\u0002\nဇ\u0005\u000bᐉ\u0006\fᐉ\u0007", new Object[]{"e", "f", "g", "b", "k", "h", "c", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new auca();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (auca.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
