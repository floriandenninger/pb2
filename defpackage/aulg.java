package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aulg extends aonm implements aooz {
    public static final aulg a;
    private static volatile aopf f;
    public int b;
    public aulq c;
    public int d;
    private byte g = 2;
    public String e = "";

    static {
        aulg aulgVar = new aulg();
        a = aulgVar;
        aonm.registerDefaultInstance(aulg.class, aulgVar);
    }

    private aulg() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", aukz.c, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aulg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aulg.class) {
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
