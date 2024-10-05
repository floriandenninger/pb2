package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aupt extends aonm implements aooz {
    public static final aupt a;
    private static volatile aopf g;
    public int b;
    public aqyg c;
    public aqyg d;
    public apxf e;
    public aupz f;
    private aqyg h;
    private aota i;
    private byte j = 2;

    static {
        aupt auptVar = new aupt();
        a = auptVar;
        aonm.registerDefaultInstance(aupt.class, auptVar);
    }

    private aupt() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0005\u0004ᐉ\u0002\u0005ᐉ\u0006\bᐉ\t\nᐉ\u0003", new Object[]{"b", "c", "e", "d", "f", "i", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aupt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aupt.class) {
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
