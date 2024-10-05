package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apnu extends aonm implements aooz {
    public static final apnu a;
    private static volatile aopf b;
    private int c;
    private aulq d;
    private apnw e;
    private aulq f;
    private aota g;
    private apxf h;
    private byte i = 2;

    static {
        apnu apnuVar = new apnu();
        a = apnuVar;
        aonm.registerDefaultInstance(apnu.class, apnuVar);
    }

    private apnu() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0004\u0005ᐉ\u0001\u0007ᐉ\u0002\tᐉ\u0006", new Object[]{"c", "d", "g", "e", "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new apnu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apnu.class) {
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
