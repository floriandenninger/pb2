package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class audp extends aonm implements aooz {
    public static final audp a;
    private static volatile aopf i;
    public int b;
    public aqyg c;
    public avgg d;
    public avgg e;
    public aqyg f;
    public aqyg g;
    public aulq h;
    private byte j = 2;

    static {
        audp audpVar = new audp();
        a = audpVar;
        aonm.registerDefaultInstance(audp.class, audpVar);
    }

    private audp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0003", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new audp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (audp.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
