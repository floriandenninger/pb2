package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqgr extends aonm implements aooz {
    public static final aqgr a;
    private static volatile aopf b;
    private int c;
    private aulq d;
    private aulq e;
    private aulq f;
    private aulq g;
    private aulq h;
    private byte i = 2;

    static {
        aqgr aqgrVar = new aqgr();
        a = aqgrVar;
        aonm.registerDefaultInstance(aqgr.class, aqgrVar);
    }

    private aqgr() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0004\n\u0005\u0000\u0000\u0005\u0004ᐉ\u0000\u0005ᐉ\u0001\u0006ᐉ\u0002\tᐉ\u0003\nᐉ\u0004", new Object[]{"c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqgr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqgr.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
