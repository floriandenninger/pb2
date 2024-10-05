package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auie extends aonm implements aooz {
    public static final auie a;
    private static volatile aopf i;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    private int j;
    private int k;

    static {
        auie auieVar = new auie();
        a = auieVar;
        aonm.registerDefaultInstance(auie.class, auieVar);
    }

    private auie() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0002\u0003)\u0007\u0000\u0000\u0000\u0003ဇ\u001b\u001bဇ\u0016\u001fဇ\u001e$ဇ\u0004%ဇ\u0005(ဇ )ဇ!", new Object[]{"j", "k", "e", "d", "f", "b", "c", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new auie();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (auie.class) {
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
