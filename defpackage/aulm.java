package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aulm extends aonm implements aooz {
    public static final aulm a;
    public static final aonk b;
    private static volatile aopf g;
    public int c;
    public boolean e;
    private aota h;
    private byte i = 2;
    public String d = "";
    public aomf f = aomf.b;

    static {
        aulm aulmVar = new aulm();
        a = aulmVar;
        aonm.registerDefaultInstance(aulm.class, aulmVar);
        b = aonm.newSingularGeneratedExtension(aqew.a, aulmVar, aulmVar, null, 60487319, aoqn.MESSAGE, aulm.class);
    }

    private aulm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ည\u0004\u0004ဇ\u0001\u0005ᐉ\u0003", new Object[]{"c", "d", "f", "e", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aulm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aulm.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
