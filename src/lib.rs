pub fn a_function(x: i32) -> i32 {
    x
}

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn a_function_returns_a_value() {
        assert_eq!(a_function(2), 2);
    }
}