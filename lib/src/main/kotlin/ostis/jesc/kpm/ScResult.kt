package ostis.jesc.kpm

enum class ScResult(
    val isSuccess: Boolean
) {
    ERROR(isSuccess = false),
    OK(isSuccess = true),
    ERROR_INVALID_PARAMS(isSuccess = false),
    ERROR_INVALID_TYPE(isSuccess = false),
    ERROR_IO(isSuccess = false),
    ERROR_INVALID_STATE(isSuccess = false),
    ERROR_NOT_FOUND(isSuccess = false),
    ERROR_NO_WRITE_RIGHTS(isSuccess = false),
    ERROR_NO_READ_RIGHTS(isSuccess = false),
    NO(isSuccess = false),
    UNKNOWN(isSuccess = false),
    SKIP(isSuccess = false);
}