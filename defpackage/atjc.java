package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atjc extends aonm implements aooz {
    public static final atjc a;
    private static volatile aopf b;
    private int c;
    private int d;
    private atjb e;
    private apxf f;
    private byte g = 2;

    static {
        atjc atjcVar = new atjc();
        a = atjcVar;
        aonm.registerDefaultInstance(atjc.class, atjcVar);
    }

    private atjc() {
        aonm.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0002\u001di\u0002\u0000\u0000\u0002\u001dᐉ\u0010iᐉ3", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new atjc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atjc.class) {
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
