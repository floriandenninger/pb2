package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arja extends aonm implements aooz {
    public static final arja a;
    private static volatile aopf i;
    public int b;
    public arnb c;
    public boolean d;
    public awfq e;
    public int f;
    public float g;
    public ariz h;
    private byte j = 2;

    static {
        arja arjaVar = new arja();
        a = arjaVar;
        aonm.registerDefaultInstance(arja.class, arjaVar);
    }

    private arja() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0013\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဇ\u0005\nဉ\u000b\u000bဌ\f\rခ\r\u0013ဉ\u0011", new Object[]{"b", "c", "d", "e", "f", argn.o, "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arja();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arja.class) {
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
