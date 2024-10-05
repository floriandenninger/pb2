package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atkk extends aonm implements aooz {
    public static final atkk a;
    private static volatile aopf b;
    private int c;
    private aulq d;
    private aulq e;
    private aulq f;
    private aota g;
    private byte h = 2;

    static {
        atkk atkkVar = new atkk();
        a = atkkVar;
        aonm.registerDefaultInstance(atkk.class, atkkVar);
    }

    private atkk() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u000b\u0004\u0000\u0000\u0004\u0002ᐉ\u0001\u0006ᐉ\u0006\bᐉ\u0004\u000bᐉ\u0002", new Object[]{"c", "d", "g", "f", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new atkk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atkk.class) {
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
